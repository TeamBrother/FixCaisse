import androidx.room.*

@Dao
interface MaintenanceRecordDao {
    @Query("SELECT * FROM maintenance_records WHERE vehicleLicensePlate = :licensePlate")
    fun getRecordsForVehicle(licensePlate: String): List<MaintenanceRecord>

    @Insert
    fun insertRecord(record: MaintenanceRecord)

    @Delete
    fun deleteRecord(record: MaintenanceRecord)
}
