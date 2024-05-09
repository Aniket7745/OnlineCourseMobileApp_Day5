import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onlinecoursemobileapp.R

@Composable
fun ContinueLearningScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(end = 16.dp)
    ) {
        Text(text = "Continue Learning", fontSize = 27.sp)
Spacer(modifier = Modifier.size(16.dp))
        Box(modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(20.dp))
        ){
            Image(
                painter = painterResource(id = R.drawable.abd),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
                    .clip(shape = RoundedCornerShape(20.dp)),

                )
        }
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ContinueLearningScreenPreview() {
    ContinueLearningScreen()
}