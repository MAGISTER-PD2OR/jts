package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guard_control_maker extends inzone_maker {
	protected int script_event_enable = 1;

	protected void ON_SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam def0, HandlerParam i0, HandlerParam i1, HandlerParam maker0) {
if (myself.enabled == 0) {
return;

}
if (script_event_arg1 == 10025) {
for (i0 = 0; i0 < myself.def_count; i0 = i0 + 1) {
def0 = myself.GetSpawnDefine(i0);
if (gg.IsNull(def0) == 0) {
def0.SendScriptEvent(2316001, 0, 0);

}

}
for (i1 = 0; i1 < myself.def_count - 1; i1 = i1 + 1) {
def0 = myself.GetSpawnDefine(i1);
if (gg.IsNull(def0) == 0) {
def0.Despawn();

}

}

}
super;
	}


}