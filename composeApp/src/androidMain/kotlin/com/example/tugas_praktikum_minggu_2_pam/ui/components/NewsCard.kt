package com.example.tugas_praktikum_minggu_2_pam.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_praktikum_minggu_2_pam.ui.colorscheme.CatpuccinMocha

@Composable
fun NewsCard(content: String) {
    val parts = content.split("\n")
    val title = parts.getOrNull(0) ?: ""
    val detail = parts.getOrNull(1) ?: ""

    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = CatpuccinMocha.surface0
        ),
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                color = CatpuccinMocha.text,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )

            if (detail.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = detail,
                    color = CatpuccinMocha.subtext0,
                    fontSize = 14.sp
                )
            }
        }
    }
}