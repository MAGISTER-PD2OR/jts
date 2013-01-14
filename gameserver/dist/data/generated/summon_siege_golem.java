package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class summon_siege_golem extends default_npc {
	protected void CREATED() {
myself.AddPetDefaultDesire_Follow(20.000000);
myself.Summon_SetOption(1, 900);
myself.AddTimerEx(100020, 1000);
myself.AddTimerEx(100021, 1000 * 60);
	}

	protected void NO_DESIRE() {
myself.AddPetDefaultDesire_Follow(20.000000);
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam c0, HandlerParam action_id) {
i0 = myself.master.target_id;
if (action_id == 1000) {
if (myself.Skill_GetConsumeMP(267321345) < myself.sm.mp && myself.Skill_GetConsumeHP(267321345) < myself.sm.hp && myself.Skill_InReuseDelay(267321345) == 0) {
myself.AddUseSkillDesireEx(i0, 267321345, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(267321345) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(267321345) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(267321345) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

} else if (action_id == 2) {
if (myself.Skill_GetConsumeMP(267321345) < myself.sm.mp && myself.Skill_GetConsumeHP(267321345) < myself.sm.hp && myself.Skill_InReuseDelay(267321345) == 0) {
myself.AddUseSkillDesireEx(i0, 267321345, 0, reply, ask, 1000000, 0);

} else if (myself.Skill_InReuseDelay(267321345) > 0) {
myself.ShowSystemMessage(myself.sm.master, 2396);

} else if (myself.Skill_GetConsumeMP(267321345) >= myself.sm.mp) {
myself.ShowSystemMessage(myself.sm.master, 2394);

} else if (myself.Skill_GetConsumeHP(267321345) >= myself.sm.hp) {
myself.ShowSystemMessage(myself.sm.master, 2395);

}

}
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 100020) {
if (myself.master.alive == 0) {
myself.Despawn();

}
myself.AddTimerEx(100020, 1000);

}
if (timer_id == 100021) {
if (myself.IsNullCreature(myself.master) == 0 && gg.OwnItemCount(myself.master, 2131) < 140 && gg.OwnItemCount(myself.master, 2131) >= 70) {
myself.Say(gg.MakeFString(1000169, "", "", "", "", ""));

}
myself.AddTimerEx(100021, 1000 * 60);

}
	}


}