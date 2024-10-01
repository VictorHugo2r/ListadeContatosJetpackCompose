package com.victorhugo.listadecontatoscompose

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.victorhugo.listadecontatoscompose.ui.theme.ListadecontatoscomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListadecontatoscomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Text(
                            text = "Contatos",
                            fontSize = 36.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier
                                .padding(12.dp)
                                .padding(start = 2.dp)
                        )

                        val Rubia = Contato(
                            name = "Rubia",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample5
                        )

                        val Gabriel = Contato(
                            name = "Gabriel",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample2
                        )

                        val Julia = Contato(
                            name = "Julia",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample1
                        )

                        val Iago = Contato(
                            name = "Iago",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample10
                        )

                        val Carol = Contato(
                            name = "Carol",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample5
                        )

                        val Ivan = Contato(
                            name = "Ivan",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample12
                        )

                        val Nubia = Contato(
                            name = "Nubia",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample13
                        )

                        val Roseli = Contato(
                            name = "Roseli",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample4
                        )

                        val Victor = Contato(
                            name = "Victor Hugo",
                            numero = "(55) 21 98356-7584",
                            image = R.drawable.sample8
                        )

                        val Agata = Contato(
                            name = "Agata",
                            numero = "(55) 11 92256-7584",
                            image = R.drawable.sample16
                        )

                        val leonardo = Contato(
                            name = "Leonardo da Vinci",
                            numero = "(55) 11 98756-7584",
                            image = R.drawable.ic_leonardo_da_vinci
                        )

                        val picasso = Contato(
                            name = "Pablo Picasso",
                            numero = "(55) 22 98756-0054",
                            image = R.drawable.ic_pablo_picasso
                        )

                        val salvador = Contato(
                            name = "Salvador Dali",
                            numero = "(55) 21 97428-7584",
                            image = R.drawable.ic_salvador_dali
                        )

                        val vanGogh = Contato(
                            name = "Vincent Van Gogh",
                            numero = "(55) 22 98795-7584",
                            image = R.drawable.ic_vincent_van_gogh
                        )

                        val contato = listOf(leonardo, vanGogh, picasso, salvador, Roseli, Nubia, Agata, Victor, Carol, Ivan, Iago, Julia, Gabriel, Rubia)

                        LazyColumn {
                            items(contato) { contato ->
                                Contatos(contato = contato)

                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun Contatos(contato: Contato) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
                    .size(65.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.FillWidth,
                painter = painterResource(id = contato.image),
                contentDescription = "número de contato"
            )
            Spacer(
                modifier = Modifier
                    .size(8.dp)
            )
            Column {
                Text(
                    text = contato.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = contato.numero,
                    color = Color.Gray
                )
            }
        }
    }

    data class Contato(
        val name: String,
        val numero: String,
        @DrawableRes val image: Int,
    )

    @Preview(showBackground = true)
    @Composable
    fun ContatosPreview() {
        ListadecontatoscomposeTheme {
            val contato = Contato(
                name = "Leonardo da Vinci",
                numero = "(55) 11 98756-7584",
                image = R.drawable.ic_leonardo_da_vinci
            )
            Contatos(contato)
        }

    }
}