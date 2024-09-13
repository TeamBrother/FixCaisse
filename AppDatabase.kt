
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Vehicle::class, MaintenanceRecord::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun vehicleDao(): VehicleDao
    abstract fun maintenanceRecordDao(): MaintenanceRecordDao
}
