package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class vicious_altar5 extends citizen {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.OwnItemCount(talker, 7167) >= 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Coming Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.OwnItemCount(talker, 7167) < 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "The Coming Darkness (In Progress)");

}
if (gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 6 && myself.GetOneTimeQuestFlag(talker, 16) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "The Coming Darkness (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.OwnItemCount(talker, 7167) >= 1) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vicious_altar5_q0016_01.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0 && gg.OwnItemCount(talker, 7167) < 1) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vicious_altar5_q0016_04.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 6 && myself.GetOneTimeQuestFlag(talker, 16) == 0) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "vicious_altar5_q0016_05.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 16) {
myself.SetCurrentQuestID(16);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 16) {
if (reply == 1 && gg.HaveMemo(talker, 16) == 1 && gg.GetMemoState(talker, 16) == 5 && myself.GetOneTimeQuestFlag(talker, 16) == 0) {
if (gg.OwnItemCount(talker, 7167) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.DeleteItem1(talker, 7167, 1);
myself.SetFlagJournal(talker, 16, 6);
myself.ShowQuestMark(talker, 16);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 16, 6);
myself.AddUseSkillDesire(myself.sm, 298123265, 0, 0, 1000000);
myself.ShowPage(talker, "vicious_altar5_q0016_02.htm");

}

} else {
myself.ShowPage(talker, "vicious_altar5_q0016_03.htm");

}

}

}
super;
	}


}