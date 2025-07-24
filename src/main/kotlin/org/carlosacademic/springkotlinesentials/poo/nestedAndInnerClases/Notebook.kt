package org.carlosacademic.springkotlinesentials.poo.nestedAndInnerClases

class Notebook(amountOfRam: Int, processor: Processor) {

    class Processor(val cores: Int){
        fun getProcessorCores() = this.cores
    }
}