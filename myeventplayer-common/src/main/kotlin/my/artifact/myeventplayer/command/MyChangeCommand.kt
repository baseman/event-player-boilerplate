import co.remotectrl.eventplayer.*
import my.artifact.eventplayer.aggregate.MyAggregate
import my.artifact.eventplayer.event.TalentCommittedEvent

class MyChangeCommand(val myChangeVal: String) : PlayCommand<MyAggregate>() {

    override fun validate(model: MyAggregate) {
        if(myChangeVal.isEmpty()){
            throw Exception("Invalid commit input")
        }
    }

    override fun getEvent(aggregateId: AggregateId<MyAggregate>, version: Int): PlayEvent<MyAggregate> {

        //todo: generate unique id
        return TalentCommittedEvent(EventLegend(EventId(0), aggregateId, version), myChangeVal)
    }
}