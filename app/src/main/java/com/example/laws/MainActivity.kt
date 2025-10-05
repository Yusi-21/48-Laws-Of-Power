package com.example.laws

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laws.data.Law
import com.example.laws.data.laws
import com.example.laws.ui.theme.LawsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LawsTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LawsApp()
                }
            }
        }
    }
}

@Composable
fun LawsApp() {
    Scaffold(
        topBar = {
            LawsTopAppBar()
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            items(laws) {
                LawItem(
                    law = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LawsTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.image_size))
                        .padding(dimensionResource(R.dimen.padding_small)),
                    painter = painterResource(R.drawable.icon_law),
                    contentDescription = null
                )
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.headlineLarge
                )
            }
        },
        modifier = modifier
    )
}

@Composable
fun LawTitle(
    @StringRes lawTitle: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            stringResource(lawTitle),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
        )
    }
}

@Composable
fun LawSubTitle(
    @StringRes lawBody: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            stringResource(lawBody),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
        )
    }
}

@Composable
fun LawImage(
    @DrawableRes lawImage: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Fit,
        painter = painterResource(lawImage),

        contentDescription = null
    )
}

@Composable
fun LawDesc(
    @StringRes lawDesc: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(lawDesc),
        modifier = modifier,
        style = MaterialTheme.typography.bodyMedium
    )
}

@Composable
fun LawItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

@Composable
fun LawItem(
    law: Law,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) MaterialTheme.colorScheme.inversePrimary // secondaryContainer //surfaceDim
        else MaterialTheme.colorScheme.primaryContainer //surfaceContainer
    )

    Card(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxSize()
                .animateContentSize(animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy,
                stiffness = Spring.StiffnessMedium
                )
            )
                .background(color = color)
        ) {
            LawTitle(law.title)
            Spacer(Modifier.weight(1f))
            LawItemButton(
                expanded = expanded,
                onClick = { expanded = !expanded }
            )
        }

        if (expanded) {
            LawSubTitle(law.subTitle)
            LawImage(
                law.imageResId, modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
            )
            LawDesc(
                law.desc, modifier = Modifier.padding(
                    start = dimensionResource(R.dimen.padding_medium),
                    top = dimensionResource(R.dimen.padding_medium),
                    bottom = dimensionResource(R.dimen.padding_medium),
                    end = dimensionResource(R.dimen.padding_medium)
                )
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LawsLightThemePreview() {
    LawsTheme(darkTheme = false) {
        LawsApp()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LawsDarkThemePreview() {
    LawsTheme(darkTheme = true) {
        LawsApp()
    }
}