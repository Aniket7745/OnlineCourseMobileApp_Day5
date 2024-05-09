import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onlinecoursemobileapp.R

@Composable
fun FeaturedScreen(modifier: Modifier = Modifier) {

    Text(text = "Popular Courses")
    Spacer(modifier = Modifier.size(20.dp))
    LazyRow(

    ) {
        itemsIndexed(
            items = listOf(
                "Item 1",
            )
        ) { index, item ->
             Learning1()
            Learning2()

        }

    }
}

@Composable
fun Learning1(modifier: Modifier = Modifier) {
   Box(modifier = Modifier
       .height(400.dp)
       .width(200.dp)
       .padding(bottom = 30.dp, end = 16.dp)
       .background(
           MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(20.dp)
       )
   ){
       Column(
           Modifier
               .fillMaxWidth()
               .padding(3.dp)
       ) {
           Image(painter = painterResource(id = R.drawable.c1), contentDescription =null,
               modifier= Modifier.clip(RoundedCornerShape(20.dp)

               )
           )
           Spacer(modifier = Modifier.size(10.dp))
           Text(text = "Learning Kotlin", fontSize = 18.sp, fontWeight = FontWeight.SemiBold,
               color = MaterialTheme.colorScheme.tertiary)
           Text(text = "By Kundu", fontSize = 12.sp, fontWeight = FontWeight.SemiBold,
               color = MaterialTheme.colorScheme.tertiary)
           Text(text = "Beginner Friendly ", fontSize = 12.sp, fontWeight = FontWeight.SemiBold,
               color = MaterialTheme.colorScheme.tertiary)
       }
   }
}
@Composable
fun Learning2(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .height(400.dp)
        .width(200.dp)
        .padding(bottom = 30.dp, end = 16.dp)
        .background(
            MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(20.dp)
        )
    ){
        Column(
            Modifier
                .fillMaxWidth()
                .padding(3.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.java), contentDescription =null,
                modifier= Modifier.clip(RoundedCornerShape(20.dp)

                )
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "Learning Java", fontSize = 18.sp, fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary)
            Text(text = "By Kundu", fontSize = 12.sp, fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary)
            Text(text = "Beginner Friendly ", fontSize = 12.sp, fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun FeaturedScreenPreview() {
    Learning1()
}
