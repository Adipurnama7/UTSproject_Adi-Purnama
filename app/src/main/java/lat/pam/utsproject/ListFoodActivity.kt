package lat.pam.utsproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFoodActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FoodAdapter
    private lateinit var foodList: List<Food>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = listOf(
            Food("Batagor", "Batagor asli enak dari Bandung", R.drawable.batagor),
            Food("Black Salad", "Salad segar yang dibuat secara langsung", R.drawable.black_salad),
            Food("Cappucino", "Kopi cappucino asli yang dibuat dari Kopi Arabica", R.drawable.cappuchino),
            Food("Cireng", "Cireng isi ayam dengan tekstur renyah", R.drawable.cireng),
            Food("Donut", "Donat susu lembut khas Bandung", R.drawable.donut),
//            Food("Cheesecake", "Cheesecake lembut dengan lapisan krim keju", R.drawable.cheesecake),
//            Food("Kopi Hitam", "Kopi hitam pekat khas Kapal Api", R.drawable.kopi_hitam),
//            Food("Mie Goreng", "Mie goreng dengan bumbu rempah khas", R.drawable.mie_goreng),
//            Food("Nasi Goreng", "Nasi goreng spesial dengan telur dan sayuran", R.drawable.nasigoreng),
//            Food("Sparkling Tea", "Minuman teh bersoda segar dan menyegarkan", R.drawable.sparkling_tea)
        )


        adapter = FoodAdapter(this, foodList)
        recyclerView.adapter = adapter
    }
}
