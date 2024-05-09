import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.onlinecoursemobileapp.R

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {

    Row(
        modifier= Modifier
            .fillMaxWidth()
            .padding(end = 16.dp),


        ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            ),
        ){
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, 15.dp, end = 20.dp)
                ,
                Arrangement.SpaceBetween
            ){
                Text(text = "Search by course name",
                    color = MaterialTheme.colorScheme.tertiary)
                Icon(painter = painterResource(id = R.drawable.search_01_stroke_rounded), contentDescription ="",
                    tint = MaterialTheme.colorScheme.tertiary)
            }
        }

    }
    Spacer(modifier = Modifier.size(20.dp))

    LazyRow(

    ) {
        itemsIndexed(
            items = listOf(
                "Item 1",
                )
        ) { index, item ->

            Box(modifier = Modifier
                .background(MaterialTheme.colorScheme.secondary, shape = RoundedCornerShape(20.dp))
                .width(150.dp)
                .height(50.dp)
                .padding(8.dp),
                Alignment.Center,


            ){
                Text(text = "Data Science",
                    color = MaterialTheme.colorScheme.onTertiary)
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box(modifier = Modifier
                .background(MaterialTheme.colorScheme.secondary, shape = RoundedCornerShape(20.dp))
                .width(150.dp)
                .height(50.dp)
                .padding(8.dp),

                Alignment.Center

            ){
                Text(text = "Buisness ",
                    color = MaterialTheme.colorScheme.onTertiary)
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box(modifier = Modifier
                .background(MaterialTheme.colorScheme.secondary, shape = RoundedCornerShape(20.dp))
                .width(155.dp)
                .height(50.dp)
                .padding(8.dp),

                Alignment.Center

            ){
                Text(text = "Computer Science",
                    color = MaterialTheme.colorScheme.onTertiary)
            }

        }
    }

}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SearchScreenPreview() {
    SearchScreen()
}

