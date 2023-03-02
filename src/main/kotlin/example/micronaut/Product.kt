package example.micronaut

import io.micronaut.core.annotation.Creator
import io.micronaut.serde.annotation.Serdeable
import org.bson.codecs.pojo.annotations.BsonCreator
import org.bson.codecs.pojo.annotations.BsonProperty
import javax.validation.constraints.NotBlank

@Serdeable 
data class Product @Creator @BsonCreator constructor( 
    @field:BsonProperty("name") @param:BsonProperty("name") @field:NotBlank val name: String,   
    @field:BsonProperty("description") @param:BsonProperty("description") var description: String?) { 

    constructor(name: String) : this(name, null)
}