import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopScreen(modifier: Modifier = Modifier) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(end = 16.dp),
            Arrangement.SpaceBetween,

        ) {
            Column {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Default.Menu, contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = "Hello Aniket", fontSize = 24.sp)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Person, contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
            }


        }

}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun TopScreenPrev(modifier: Modifier = Modifier) {
    TopScreen()
}