import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.padding(16.dp, top = 32.dp, )

    ) {
        TopScreen()
        Spacer(modifier = Modifier.height(16.dp))
        SearchScreen()
        Spacer(modifier = Modifier.height(20.dp))
        ContinueLearningScreen()
        Spacer(modifier = Modifier.height(16.dp))
        FeaturedScreen()
    }


}