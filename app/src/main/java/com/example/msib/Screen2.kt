package com.example.msib

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
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
import kotlin.random.Random


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screen2(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar1(navController = navController) }
    ) {
        Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
            val imageId = arrayOf(
                R.drawable.frame21,
                R.drawable.frame22,
                R.drawable.frame23,
                R.drawable.frame24,
                R.drawable.frame25,
                R.drawable.frame26,
                R.drawable.frame27,
                R.drawable.frame28,
                R.drawable.frame29,
                R.drawable.frame30,
            )
            val names = arrayOf(
                "Gatang Kenari",
                "Ikan Bakar Manokwari",
                "Ikan Cakalang Asar",
                "Kue Sagu Bagea",
                "Udang Selingkuh",
                "Kue Lontar",
                "Papeda",
                "Soto Banjar",
                "Bika Ambon",
                "Gulai Belacan",

                )
            val ingredients = arrayOf(
                "Berasal Dari Provinsi Maluku",
                "Berasal Dari Papua",
                "Berasal Dari Papua Barat",
                "Berasal Dari Papua Tengah",
                "Berasal Dari Papua Timur",
                "Berasal Dari Papua Selatan",
                "Berasal Dari Maluku",
                "Berasal DarI kalimantan Selatan",
                "Berasal Dari Sumatra Utara",
                "Berasal DarI Provinsi Riau",

                )
            val detail = arrayOf(
                "Makanan tradisional dari provinsi Maluku Utara yang paling populer adalah gatang kenari.\n" +
                        "\n" +
                        "Kenari dalam hal ini bukanlah sejenis kacang-kacangan, melainkan ketam kenari atau kepiting kenari.\n" +
                        "\n" +
                        "Kepiting kenari yang menjadikan buah kelapa sebagai makanan utamanya ini bisa diolah menjadi hidangan nikmat dan digemari banyak masyarakat.",

                "Ikan bakar Manokwari memiliki ciri khas tersendiri jika dibandingkan dengan ikan bakar daerah lainnya.\n" +
                        "\n" +
                        "Ikan bakar ini menggunakan sambal mentah yang dihaluskan dan disiram di atasnya.\n" +
                        "\n" +
                        "Walau mentah, rasanya super endul dan tak boleh Moms lewatkan.",

                "Ikan cakalang asar pada dasarnya hampir sama dengan ikan cakalang asap.\n" +
                        "\n" +
                        "Perbedaannya terletak dari proses pengasapannya, jika pengasapan dilakukan dengan meletakkan ikan di atas bara api secara horizontal.\n" +
                        "\n" +
                        "Sedangkan pengasarkan dilakukan dengan meletakkan ikan secara diagonal di sisi bara yang menghasilkan asap.",

                "Makanan tradisional dari Papua Tengah yang satu ini disebut sebagai kue sagu bagea karena menggunakan tepung sagu untuk bahan baku utamanya.\n" +
                        "\n" +
                        "Kue sagu bagea khas Papua ini memiliki tekstur yang keras dan renyah. Dengan cita rasanya manis sehingga banyak digemari.",

                "Makanan tradisional khas Papua Timur yang satu ini memiliki nama unik berupa udang selingkuh.\n" +
                        "\n" +
                        "Dinamakan udang selingkuh karena udang yang diolah memiliki bentuk tubuh seperti udang pada umumnya.\n" +
                        "\n" +
                        "Namun, bagian capitnya mirip seperti kepiting.\n" +
                        "\n" +
                        "Jenis udang yang digunakan ini merupakan udang perairan air tawar. Biasanya, dipanen dari sungai.",

                "Kue lontar khas Papua Selatan ini secara sejarah dibawa oleh serdadu Hindia Belanda pada masa penjajahan.\n" +
                        "\n" +
                        "Nama kue lontar ini berasal dari Bahasa Belanda berupa ronde taart atau kue bundar.\n" +
                        "\n" +
                        "Namun karena masyarakat sekitar tidak dapat melafalkannya secara jelas, disebutlah sebagai kue lontar.\n" +
                        "\n" +
                        "Kue lontar memiliki tekstur yang renyah di bagian pinggir dan bagian tengahnya sangat lembut.",

                "Makanan tradisional Maluku yang cukup terkenal adalah papeda.\n" +
                        "\n" +
                        "Papeda adalah makanan berupa bubur sagu khas Maluku dan Papua yang biasanya disajikan dengan ikan tongkol atau mubara yang dibumbui dengan kunyit.\n" +
                        "\n" +
                        "Papeda berwarna putih dan bertekstur lengket menyerupai lem dengan rasa yang tawar.\n" +
                        "\n" +
                        "Ini merupakan makanan yang kaya serat, rendah kolesterol, dan cukup bernutrisi.",

                "Soto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih.\n" +
                        "\n" +
                        "Seperti halnya soto ayam, bumbu soto Banjar berupa bawang merah, bawang putih dan merica, tetapi tidak memakai kunyit.",

                "Bika ambon adalah penganan khas Medan, Sumatera Utara, Indonesia.\n" +
                        "\n" +
                        "Camilan ini terbuat dari bahan-bahan seperti tepung tapioka, telur, gula, dan santan.\n" +
                        "\n" +
                        "Kini bika ambon memiliki banyak varian rasa, ada rasa pandan, durian, keju, dan cokelat.",

                "Gulai belacan merupakan makanan tradisional Riau.\n" +
                        "\n" +
                        "Ini berbahan dasar udang yang dipadukan dengan berbagai macam rempah-rempah pilihan dan dikombinasikan dengan belacan atau terasi.\n" +
                        "\n" +
                        "Selain udang, gulai belacan juga biasa dibuat dari daging ayam dan ikan.",

            )
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "Screen12") {
                composable("Screen12") {
                    Screen12(imageId, names, ingredients, detail, navController)
                }
                composable(
                    route = "Data2/{index}",
                    arguments = listOf(
                        navArgument(name = "index") {
                            type = NavType.IntType
                        }
                    )
                ) { index ->
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
fun TopAppBar1(navController: NavController) {
    TopAppBar(
        title = { Text("Lazy Grid") },
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Pink400)
    )
}

@Composable
fun Screen12(
    imageId: Array<Int>,
    names: Array<String>,
    ingredients: Array<String>,
    detail: Array<String>,
    navController: NavController,
) {
    Column {
        Spacer(modifier = Modifier.height(50.dp)) // Menambahkan jarak antara TopAppBar dan LazyRow
        LazyVerticalGrid(
            //columns = GridCells.Adaptive(150.dp),
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(10) { index ->
                ColumnItem2(
                    painter = imageId[index],
                    title = names[index],
                    ingredients = ingredients[index],
                    detail = detail,
                    navController = navController,
                    itemIndex = index

                )
            }
        }
    }
}

@Composable
fun ColumnItem2(
    painter: Int,
    title: String,
    detail: Array<String>,
    ingredients: String,
    itemIndex: Int,
    navController: NavController,
) {
    Card(
        modifier = Modifier
            .size(240.dp)
            .padding(6.dp)
            .clickable { navController.navigate(route= "Data2/$itemIndex") },
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(140.dp)
                    .padding(1.dp)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = painter),
                    contentDescription = title,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = title,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )
                Text(
                    text = ingredients,
                    fontSize = 10.sp,
                    color = Color.Black
                )
            }
        }
    }
}




