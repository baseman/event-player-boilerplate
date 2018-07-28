import co.remotectrl.eventplayer.Aggregate
import co.remotectrl.eventplayer.AggregateLegend

class MyAggregate(override val legend: AggregateLegend<MyAggregate>, val myVal: String) : Aggregate<MyAggregate>()
