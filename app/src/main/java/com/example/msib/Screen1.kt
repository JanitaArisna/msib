package com.example.msib

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.msib.ui.theme.Pink400

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen1(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar(navController = navController) }
    ) {
        Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
            val imageId = arrayOf(
                R.drawable.frame1,
                R.drawable.frame2,
                R.drawable.frame3,
                R.drawable.frame4,
                R.drawable.frame5,
                R.drawable.frame6,
                R.drawable.frame7,
                R.drawable.frame8,
                R.drawable.frame9,
                R.drawable.frame10,
                R.drawable.frame11,
                R.drawable.frame12,
                R.drawable.frame13,
                R.drawable.frame14,
                R.drawable.frame15,
                R.drawable.frame16,
                R.drawable.frame17,
                R.drawable.frame18,
                R.drawable.frame19,
                R.drawable.frame20,
            )
            val names = arrayOf(
                "Mie Aceh",
                "Rendang",
                "Pempek",
                "Kerak Telor",
                "Karedok",
                "Garang Asem",
                "Gudeg",
                "Rujak Cingur",
                "Ayam Betutu",
                "Sate Bandeng",
                "Ayam Taliwang",
                "Coto Makassar",
                "Bau Peapi",
                "Uta Dada",
                "Bubur Manado",
                "Kabuto",
                "Bubur Pedas",
                "Gence Ruan",
                "Juhu Singkah",
                "Nasi Subut"
            )
            val ingredients = arrayOf(
                "Berasal Dari Provinsi Aceh",
                "Berasal Dari Sumatera Barat",
                "Berasal Dari Sumatera Selatan",
                "Berasal Dari DKI Jakarta",
                "Berasal Dari Jawa Barat",
                "Berasal Dari Jawa Tengah",
                "Berasal Dari Yogyakarta",
                "Berasal Dari Jawa Timur",
                "Berasal Dari Bali",
                "Berasal Dari Banten",
                "Berasal Dari Nusa Tenggara Barat",
                "Berasal Dari Sulawesi Selatan",
                "Berasal Dari Sulawesi Barat",
                "Berasal Dari Sulawesi Tengah",
                "Berasal Dari Sulawesi Utara",
                "Berasal Dari Sulawesi Tenggara",
                "Berasal Dari Kalimantan Barat",
                "Berasal Dari Kalimantan Timur",
                "Berasal Dari Kalimantan Tengah",
                "Berasal Dari Kalimantan Utara",
            )
            val detail = arrayOf(
                "Mi ini disajikan dengan menggunakan mi kuning tebal dengan irisan daging sapi, daging kambing atau seafood, seperti udang dan cumi.\n" +
                        "\n" +
                        "Lalu disajikan dalam sup sejenis kari yang gurih dan pedas.",

                "Rendang atau randang dalam bahasa Minangkabau adalah masakan Minangkabau yang berbahan dasar daging dan berasal dari Sumatera Barat, Indonesia.\n" +
                        "\n" +
                        "Makanan tradisional ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan.",

                "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan digiling lembut dan dicampur tepung kanji atau tepung sagu.\n" +
                        "\n" +
                        "Kemudian dikombinasikan dengan beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam.",

                "Kerak telor adalah makanan tradisional asli daerah Jakarta (Betawi), yang terbuat dari bahan-bahan beras ketan putih, telur ayam atau bebek.\n" +
                        "\n" +
                        "Lalu dicampurkan dengan ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng.",

                "Karedok adalah salah satu makanan khas Sunda di Indonesia.\n" +
                        "\n" +
                        "Salah satu ciri dari karedok adalah menggunakan oncom bakar. Bila tidak menggunakan oncom bakar disebutnya lotek mentah.",

                "Garang asem merupakan makanan tradisional khas Jawa Tengah.\n" +
                        "\n" +
                        "Garang asem adalah masakan olahan ayam yang dimasak menggunakan daun pisang dan didominasi oleh rasa asam dan pedas.\n" +
                        "\n" +
                        "Garang asem biasa disajikan sebagai lauk pendamping nasi, ditambah dengan tusukan ayam asam manis, tempe goreng, dan perkedel.",

                "Gudeg adalah makanan tradisional khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan.\n" +
                        "\n" +
                        "Perlu waktu berjam-jam untuk membuat makanan tradisional Yogyakarta yang satu ini. Warna cokelat biasanya dihasilkan oleh daun jati yang dimasak bersamaan.",

                "Rujak cingur adalah salah satu makanan tradisional Jawa Timur, yang umum ditemukan di sekitaran Surabaya.\n" +
                        "\n" +
                        "Kemudian ditambah lontong, tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah atau taoge, kangkung, dan kacang panjang.",

                "Ayam betutu merupakan makanan tradisional Bali yang dibuat dari daging ayam yang telah dibersihkan.\n" +
                        "\n" +
                        "Kemudian, ayam dibalurkan bumbu khas Bali ke seluruh permukaan tubuh daging ayam.\n" +
                        "\n" +
                        "Daging ayam yang telah dibumbui tersebut kemudian direbus atau langsung dibakar hingga menghasilkan aroma yang khas.",

                "Sate bandeng merupakan makanan khas dari Provinsi Banten, tepatnya dari Serang.\n" +
                        "\n" +
                        "Sesuai namanya, sate satu ini menggunakan bahan dasar dari ikan bandeng.\n" +
                        "\n" +
                        "Sate Bandeng dibuat dari ikan bandeng yang dihilangkan durinya, lalu dagingnya dihaluskan dicampur dengan bumbu, dan dimasukkan kembali ke dalam kulit ikan bandeng.",

                "Ayam taliwang merupakan makanan tradisional yang disajikan dengan menggunakan ayam kampung muda, lalu dibakar kemudian dibumbui dengan semacam saus.\n" +
                        "\n" +
                        "Makanan ini biasanya disajikan bersama makanan khas NTB yang lain, misalnya plecing kangkung.",

                "Coto Makassar atau coto mangkasara terbuat dari jeroan sapi yang direbus dalam waktu yang lama.\n" +
                        "\n" +
                        "Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu yang diracik secara khusus.",

                "Bau Peapi adalah makanan tradisional Mandar, Sulawesi Barat, yang bahan-bahannya terdiri dari:\n" +
                        "\n" +
                        "- Ikan (ikan tuna, ikan tongkol, ikan layang dan lain-lain)\n" +
                        "- Air\n" +
                        "- Cabai kecil\n" +
                        "- Lasuna Mandar (bawang merah khas Mandar)\n" +
                        "- Paissang (asam dari daging mangga yang diiris kecil-kecil dan sudah dikeringkan)\n" +
                        "- Bubuk kunyit\n" +
                        "- Minyak kelapa Mandar",

                "Uta dada merupakan olahan daging ayam kampung yang dimasak menggunakan santan.\n" +
                        "\n" +
                        "Makanan ini terkenal sangat gurih dan pedas.\n" +
                        "\n" +
                        "Uta dalam bahasa Kaili berarti kuah dan dada santan.\n" +
                        "\n" +
                        "Makanan tradisional ini biasa disantap dengan ketupat seperti dalam penyajian opor ayam khas Betawi.",

                "Bubur Manado atau tinutuan adalah salah satu kuliner Indonesia yang merupakan campuran dari berbagai macam sayuran.\n" +
                        "\n" +
                        "Tinutuan biasanya disajikan untuk sarapan pagi beserta berbagai pelengkap hidangannya.\n" +
                        "\n" +
                        "Walaupun demikian, tinutuan umumnya tetap dapat ditemukan di berbagai rumah makan di luar waktu sarapan.",

                "Kabuto merupakan makanan khas asal Kabupaten Muna dan Buton di Provinsi Sulawesi Tenggara yang terbuat dari ubi kayu atau singkong.\n" +
                        "\n" +
                        "Makanan tradisional ini berasal dari ubi kayu fermentasi yang dikukus, bertekstur lembek dan lentur saat dihidangkan.",

                "Bubur pedas atau Bubbor Paddas adalah hidangan bubur tradisional dari Orang Melayu baik di Sambas dan Sarawak.\n" +
                        "\n" +
                        "Bubur pedas terbuat dari nasi halus dan kelapa parut. Stock dibuat dari daging tulang seperti tulang rusuk atau irisan ayam.",

                "Gence ruan merupakan makanan khas rica-rica dari Kutai Kartanegara, Kalimantan Timur.\n" +
                        "\n" +
                        "Ruan merupakan nama yang diambil dari nama ikan yang digunakan, yaitu ikan “Haruan” atau ikan Gabus.\n" +
                        "\n" +
                        "Sedangkan Gence adalah nama dari bumbu khas hidangan ini.",

                "Juhu singkah adalah makanan khas masyarakat Dayak di provinsi Kalimantan Tengah, Indonesia.\n" +
                        "\n" +
                        "Dalam bahasa Ngaju, juhu artinya masakan berkuah, sedangkan singkah artinya umbut, yang merujuk kepada batang rotan yang masih muda.",

                "Nasi subut terbuat dari campuran jagung dan ubi jalar ungu. Oleh karena itu, nasinya juga berwarna ungu.\n" +
                        "\n" +
                        "Rasanya agak legit dengan tekstur yang pulen.\n" +
                        "\n" +
                        "Nasi subut selalu disantap dengan lauk sate ikan pari. Kedua jenis makanan itu selalu dipasangkan sejak dahulu."

            )
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "Screen11") {
                composable("Screen11") {
                    Screen11(imageId, names, ingredients, detail, navController)
                }
                composable(
                    route = "Data1/{index}",
                    arguments = listOf(
                        navArgument(name = "index") {
                            type = NavType.IntType
                        }
                    )
                ) {index->
                    Data1(
                        photos = imageId,
                        names = names,
                        ingredients = ingredients,
                        detail = detail,
                        itemIndex = index.arguments?.getInt("index")
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(navController: NavController) {
    TopAppBar(
        title = { Text("Lazy Column dan Lazy Row") },
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Pink400)
    )
}

@Composable
fun Screen11(
    imageId: Array<Int>,
    names: Array<String>,
    ingredients: Array<String>,
    detail: Array<String>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Spacer(modifier = Modifier.height(50.dp)) // Menambahkan jarak antara TopAppBar dan LazyRow

        // Bagian pertama data untuk LazyRow
        LazyRow(contentPadding = PaddingValues(16.dp)) {
            val itemCount = 10 // Ambil 10 data pertama

            items(itemCount) {
                ColumnItem1(
                    modifier,
                    painter = imageId,
                    title = names,
                    ingredients = ingredients,
                    itemIndex = it,
                    detail = detail,
                    navController = navController
                )
            }
        }

        // Bagian kedua data untuk LazyColumn
        LazyColumn(contentPadding = PaddingValues(16.dp)) {
            val itemCount = 10 // Ambil 10 data berikutnya

            items(itemCount) {
                ColumnItem(
                    modifier,
                    painter = imageId,
                    title = names,
                    ingredients = ingredients,
                    itemIndex = it + 10,
                    detail = detail,
                    navController = navController
                )
            }
        }
    }
}



@Composable
fun ColumnItem(
    modifier: Modifier,
    painter: Array<Int>,
    title: Array<String>,
    ingredients: Array<String>,
    detail: Array<String>,
    itemIndex: Int,
    navController: NavController
) {
    Card(
        modifier = modifier
            .padding(16.dp)
            .wrapContentHeight()
            .clickable { navController.navigate(route= "Data1/$itemIndex") },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(
                painter = painterResource(id = painter[itemIndex]),
                contentDescription = title[itemIndex],
                modifier = Modifier.size(140.dp)
            )
            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = title[itemIndex],
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = ingredients[itemIndex],
                    fontSize = 8.sp,
                    color = Color.Black
                )
            }
        }
    }
}

@Composable
fun ColumnItem1(
    modifier: Modifier,
    painter: Array<Int>,
    title: Array<String>,
    ingredients: Array<String>,
    detail: Array<String>,
    itemIndex: Int,
    navController: NavController
) {
    Card(
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(250.dp)
            .aspectRatio(1.5f)
            .clickable { navController.navigate(route= "Data1/$itemIndex") },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically, // Mengubah alignment menjadi vertical center
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Box(
                modifier = Modifier.weight(1f), // Menjadikan Box sebagai pembungkus gambar agar bisa diatur posisinya
                contentAlignment = Alignment.Center // Gambar akan diatur ke tengah
            ) {
                Image(
                    painter = painterResource(id = painter[itemIndex]),
                    contentDescription = title[itemIndex],
                    modifier = Modifier.size(200.dp)
                )
            }
            Column(modifier = Modifier.weight(1f).padding(12.dp)) { // Memberikan padding ke Column agar tidak menempel dengan gambar
                Text(
                    text = title[itemIndex],
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = ingredients[itemIndex],
                    fontSize = 10.sp,
                    color = Color.Black
                )
            }
        }
    }
}
