package com.example.tugas_praktikum_minggu_2_pam.model

data class News(
    val id: Int,
    val title: String,
)

object NewsFactory {
    private val titles = listOf<String>(
        "Crunchyroll salah upload episode anime fate strange fake",
        "Whatsapp web dikabarkan akan menambahkan call support di website",
        "Rust di linux kernel sudah permanen, tag experimental sudah dihapus",
        "Linux 6.19 keluar dengan dukungan driver modern AMDGPU pada gpu legacy",
        "Pipewire 1.6 rilis dengan banyak fitur baru",
        "SIMDJson menunjukan peningkatan performa pada SIMD di JSON Parsing",
        "Apple M3 terus menunjukan peningkatan pada Asahi Linux",
        "Linux 7.0 membawa beberapa peningkatan untuk laptop modern" )
    fun generateNews(id: Int): News {
        return News(
            id = id,
            title = titles.random(),
        )
    }
}
