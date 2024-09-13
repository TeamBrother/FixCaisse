import androidx.room.*

@Dao
interface VehicleDao {
    @Query("SELECT * FROM vehicles")
    fun getAllVehicles(): List<Vehicle>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertVehicle(vehicle: Vehicle)

    @Delete
    fun deleteVehicle(vehicle: Vehicle)
}
