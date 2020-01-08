data class Person(
	val name: String,
	val age: Int = 99,
	val cool: Boolean,
	val nice: Boolean
)

data class PersonDto(
	val name: String,
	val age: Int = 99,
	val cool: Boolean,
	val nice: Boolean
)

fun PersonDto.toDomain() = Person(
		name = name,
		age = age,
		cool = cool,
		nice = nice
	)

val personDto = PersonDto("Pim", 33, true, false)
println(personDto.toDomain())