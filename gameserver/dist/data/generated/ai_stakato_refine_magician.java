package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_stakato_refine_magician extends wizard_ag_ddmagic2 {
	protected void MY_DYING(HandlerParam maker0) {
maker0 = myself.GetMyMaker();
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 20090501, myself.GetLifeTime() + myself.sm.param3, myself.GetCurrentTick());

} else {
myself.Say("메이커가 Null 입니다.");

}
super;
	}


}