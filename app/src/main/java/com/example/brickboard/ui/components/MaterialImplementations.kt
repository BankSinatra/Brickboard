package com.example.brickboard.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.compositeOver
import com.example.brickboard.ui.theme.BrickboardTheme

@Composable
fun BbButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = BrickboardTheme.colours.primary,
            contentColor = BrickboardTheme.colours.onPrimary,
            disabledContainerColor = BrickboardTheme.colours.primary
                .copy(alpha = 0.12f)
                .compositeOver(BrickboardTheme.colours.primary),
            disabledContentColor = BrickboardTheme.colours.onPrimary
                .copy(alpha = 0.50f)
        ),
        shape = ButtonShape,
        onClick = onClick,
        modifier = modifier,
        content = {
            ProvideTextStyle(
                value = BrickboardTheme.typography.body
            ) {
                content()
            }
        }
    )
}

val ButtonShape = RoundedCornerShape(percent = 50)