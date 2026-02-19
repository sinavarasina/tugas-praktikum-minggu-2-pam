package com.example.tugas_praktikum_minggu_2_pam.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_praktikum_minggu_2_pam.model.News
import com.example.tugas_praktikum_minggu_2_pam.style.colorscheme.CatpuccinMocha
import com.example.tugas_praktikum_minggu_2_pam.viewmodel.NewsFeedViewModel
import org.jetbrains.compose.resources.painterResource

import tugaspraktikumminggu2pam.composeapp.generated.resources.Res
import tugaspraktikumminggu2pam.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val viewModel = remember { NewsFeedViewModel() }

        LaunchedEffect(Unit) {
            viewModel.startProcessing()
        }

        val count by viewModel.readCount.collectAsState()
        val feedlist by viewModel.newsFeed.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(CatpuccinMocha.base)
                .safeContentPadding()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "News Feed - 123140107",
                color = CatpuccinMocha.mauve,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "total berita tersinkron : $count",
                color = CatpuccinMocha.green,
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 16.dp, top = 4.dp)
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) { }
        }
    }
}