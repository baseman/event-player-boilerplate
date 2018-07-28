import co.remotectrl.eventplayer.*
import my.artifact.eventplayer.aggregate.MyAggregate

data class MyChangedEvent(
        override val legend: EventLegend<MyAggregate>,
        val myChangeVal: String
) : PlayEvent<MyAggregate>() {

    constructor() : this(EventLegend(0, 0, 0), "")

    override fun applyChangesTo(latestVersion: Int): MyAggregate {
        return MyAggregate(
                AggregateLegend(legend.aggregateId, latestVersion),
                myVal = myChangeVal)
    }

}