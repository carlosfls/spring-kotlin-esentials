package org.carlosacademic.springkotlinesentials.poo.abtractClassesAndInterfaces

class EntityRepositoryImpl: EntityRepository {

    override fun save(entity: String) {
        println("Saving $entity")
    }

    override fun load(id: Int): String {
        println("Loading entity with id $id")
        return "Entity with id $id"
    }

    override fun delete(id: Int) {
        println("Deleting entity with id $id")
    }
}