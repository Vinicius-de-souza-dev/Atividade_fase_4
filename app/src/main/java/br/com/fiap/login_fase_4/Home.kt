package br.com.fiap.login_fase_4

import android.os.Bundle
import android.text.SpannableString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.login_fase_4.R
import br.com.fiap.login_fase_4.ui.theme.Login_Fase_4Theme

@Composable
fun Home(navController: NavController) {

    var cep = remember { mutableStateOf("") }

    var rua = remember { mutableStateOf("") }

    var bairro = remember { mutableStateOf("") }

    var cidade = remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            // ---- header ---------
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(colorResource(id = R.color.azul))
            ) {


                Text(
                    text = "Home",
                    fontSize = 36.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 24.dp)
                        .offset(y = (20).dp)
                )
            }

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {

            Card(
                modifier = Modifier
                    .offset(y = (100).dp)
                    .fillMaxWidth(),
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xfff9f6f6)),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {

                Column(
                    modifier = Modifier.padding(
                        vertical = 16.dp,
                        horizontal = 32.dp
                    )
                ) {
                    Text(
                        text = "CEP",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.azul),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(7.dp))
                    Text(
                        text = "CEP",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.azul)
                    )
                    OutlinedTextField(
                        value = cep.value,
                        onValueChange = { cep.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Seu CEP.")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        ),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                    Text(
                        text = "Rua",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.azul),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(7.dp))
                    Text(
                        text = "Rua",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.azul)
                    )
                    OutlinedTextField(
                        value = rua.value,
                        onValueChange = { rua.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Sua rua.")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        ),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )

                    Text(
                        text = "Bairro",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.azul),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(7.dp))
                    Text(
                        text = "Bairro",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.azul)
                    )
                    OutlinedTextField(
                        value = bairro.value,
                        onValueChange = { bairro.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Seu bairro.")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        ),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )

                    Text(
                        text = "Cidade",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.azul),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(7.dp))
                    Text(
                        text = "Cidade",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.azul)
                    )
                    OutlinedTextField(
                        value = cidade.value,
                        onValueChange = { cidade.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Sua cidade.")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.azul),
                            focusedBorderColor = colorResource(id = R.color.azul)
                        ),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.azul))
                    ) {
                        Text(
                            text = "Registrar",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                }

            }

        }

    }

}