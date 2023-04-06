package example.micronaut

import com.fasterxml.jackson.annotation.JsonFormat
import io.micronaut.core.annotation.Introspected
import org.bson.BsonType
import org.bson.codecs.pojo.annotations.BsonCreator
import org.bson.codecs.pojo.annotations.BsonProperty
import org.bson.conversions.Bson
import java.time.LocalDate
import java.time.LocalDateTime
import javax.validation.constraints.NotBlank

@Introspected
data class Product @BsonCreator constructor(
    @field:BsonProperty("name") @param:BsonProperty("name") @field:NotBlank val name: String,
    @field:BsonProperty("description") @param:BsonProperty("description") var description: String?,
    @field:BsonProperty("creator") @param:BsonProperty("creator") val creator: String,
    @field:BsonProperty("productType") @param:BsonProperty("productType") val productType: String,
    @field:BsonProperty("created_date") @param:BsonProperty("created_date") val createdDate: String,
    @field:BsonProperty("deadline_date") @param:BsonProperty("deadline_date") val deadlineDate: String,
    @field:BsonProperty("quantity") @param:BsonProperty("quantity") val quantity: Int,
    @field:BsonProperty("price") @param:BsonProperty("price") val price: Double,
    @field:BsonProperty("users_id") @param:BsonProperty("users_id") val users: List<UserInfo>,
    @field:BsonProperty("status") @param:BsonProperty("status") val status: String
) {
    constructor() : this("", null, "", "","", "", 0, 0.0, emptyList(), "")
}

data class UserInfo @BsonCreator constructor(
    @field:BsonProperty("id") @param:BsonProperty("id") val id: String,
    @field:BsonProperty("date") @param:BsonProperty("date")val date: String,
    @field:BsonProperty("quantity") @param:BsonProperty("quantity") val quantity: Int
) {
    constructor() : this("", "", 0)
}