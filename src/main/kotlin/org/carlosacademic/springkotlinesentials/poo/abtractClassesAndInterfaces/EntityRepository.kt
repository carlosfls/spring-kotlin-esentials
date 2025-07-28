package org.carlosacademic.springkotlinesentials.poo.abtractClassesAndInterfaces

interface EntityRepository {

    fun save(entity: String)

    fun load(id: Int): String

    fun delete(id: Int)

    fun saveAll(entities: List<String>){
        for (entity in entities) {
            save(entity)
        }
    }
}