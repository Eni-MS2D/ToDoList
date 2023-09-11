import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_view)

        val selectedItem = intent.getStringExtra("selectedItem")

        val detailTextView = findViewById<TextView>(R.id.nameList)
        detailTextView.text = selectedItem
    }
}
