package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class master_aiken extends fighter_coach {
	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 74) == 0 && myself.GetOneTimeQuestFlag(talker, 74) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Saga of the Dreadnought");

}
if (gg.HaveMemo(talker, 74) == 0 && myself.GetOneTimeQuestFlag(talker, 74) == 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Saga of the Dreadnought (Done)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 1) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 15) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Saga of the Dreadnought (In Progress)");

}
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 16) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Saga of the Dreadnought (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 0 && myself.GetOneTimeQuestFlag(talker, 74) == 0) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.GetMemoCount(talker) < 41) {
if (talker.level >= 76 && talker.occupation == 3) {
myself.ShowQuestPage(talker, "master_aiken_q0074_0101.htm", 74);

} else {
myself.ShowQuestPage(talker, "master_aiken_q0074_0102.htm", 74);

}

} else {
myself.ShowPage(talker, "fullquest.htm");

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 0 && myself.GetOneTimeQuestFlag(talker, 74) == 1) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "finishedquest.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 1) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_aiken_q0074_0104.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 15) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "master_aiken_q0074_0106.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 16) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.ClassChange(talker, 89);
myself.SetOneTimeQuestFlag(talker, 74, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 74);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "master_aiken_q0074_0109.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.ShowPage(talker, "master_aiken_q0074_0110.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void QUEST_ACCEPTED(HandlerParam quest_id, HandlerParam talker) {
if (quest_id == 74) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.HaveMemo(talker, 74) == 0 && myself.GetOneTimeQuestFlag(talker, 74) == 0 && talker.level >= 76 && talker.occupation == 3) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7097, 1);
myself.SetMemo(talker, 74);
myself.ShowQuestMark(talker, 74);
myself.SetMemoState(talker, 74, 1);
myself.SetFlagJournal(talker, 74, 1);
myself.SoundEffect(talker, "ItemSound.quest_accept");
myself.ShowQuestPage(talker, "master_aiken_q0074_0103.htm", 74);
gg.AddLog(1, talker, 74);

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam reply, HandlerParam talker) {
if (ask == 74) {
myself.SetCurrentQuestID(74);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 74) {
if (reply == 1) {
if (gg.HaveMemo(talker, 74) == 0 && talker.occupation == 3 && talker.level >= 76 && myself.GetOneTimeQuestFlag(talker, 74) == 0) {
myself.FHTML_SetFileName(fhtml0, "master_aiken_q0074_0105.htm");
myself.FHTML_SetInt(fhtml0, "quest_id", 74);
myself.ShowQuestFHTML(talker, fhtml0, 74);

}

} else if (reply == 2) {
if (gg.HaveMemo(talker, 74) == 1 && talker.occupation == 3 && gg.GetMemoState(talker, 74) == 15) {
if (talker.level >= 76) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.AddUseSkillDesire(talker, 334430209, 1, 0, 1000000);
myself.DeleteItem1(talker, 7097, gg.OwnItemCount(talker, 7097));
myself.ClassChange(talker, 89);
myself.SetOneTimeQuestFlag(talker, 74, 1);
myself.GiveItem1(talker, 57, 5000000);
myself.GiveItem1(talker, 6622, 1);
myself.IncrementParam(talker, 0, 2299404);
myself.RemoveMemo(talker, 74);
gg.AddPCSocial(gg.GetIndexFromCreature(talker), 3);
myself.ShowPage(talker, "master_aiken_q0074_0107.htm");
myself.ShowSystemMessage(talker, 1606);

}

} else {
myself.SetMemoState(talker, 74, 16);
myself.SetFlagJournal(talker, 74, 20);
myself.ShowQuestMark(talker, 74);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.DeleteItem1(talker, 7097, gg.OwnItemCount(talker, 7097));
myself.ShowPage(talker, "master_aiken_q0074_0108.htm");

}

}

}

}
super;
	}


}