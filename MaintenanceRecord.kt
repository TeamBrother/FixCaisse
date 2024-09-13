import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "maintenance_records")
data class MaintenanceRecord(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val vehicleLicensePlate: String,
    val date: Date,
    val type: String,
    val mileage: Int,
    val description: String,
    val costAmount: Double,
    val receiptPhotoUri: String?, // URI of the receipt photo
    val odometerPhotoUri: String? // URI of the odometer photo
)
