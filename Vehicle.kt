import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vehicles")
data class Vehicle(
    @PrimaryKey val licensePlate: String,
    val type: String, // "Car" or "Motorcycle"
    val make: String,
    val model: String,
    val year: Int
)
