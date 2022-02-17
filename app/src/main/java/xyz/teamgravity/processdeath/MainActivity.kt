package xyz.teamgravity.processdeath

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import xyz.teamgravity.processdeath.ui.theme.ProcessDeathTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val viewmodel = viewModel<MainViewModel>()

            ProcessDeathTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Button(
                            modifier = Modifier.align(Alignment.Center),
                            onClick = {
                                viewmodel.onCount()
                            }
                        ) {
                            Text(text = "Counter is ${viewmodel.counter}")
                        }
                    }
                }
            }
        }
    }
}