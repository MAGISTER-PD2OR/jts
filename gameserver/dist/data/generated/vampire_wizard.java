package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class vampire_wizard extends wizard_corpse_vampire_teleport {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i0, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 632) == 1 && gg.GetMemoState(target, 632) == 1 * 10 + 1 || gg.GetMemoState(target, 632) == 1 * 10 + 2) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 632) == 1 && gg.GetMemoState(target, 632) == 1 * 10 + 1 || gg.GetMemoState(target, 632) == 1 * 10 + 2) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 632) == 1 && gg.GetMemoState(target, 632) == 1 * 10 + 1 || gg.GetMemoState(target, 632) == 1 * 10 + 2) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 7 && gg.OwnItemCount(target, 9744) == 0) {
always_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 7 && gg.OwnItemCount(target, 9744) == 0) {
always_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 236) == 1 && myself.GetOneTimeQuestFlag(target, 236) == 0 && gg.GetMemoState(target, 236) == 7 && gg.OwnItemCount(target, 9744) == 0) {
always_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 1: {
myself.SetCurrentQuestID(236);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i0 = gg.Rand(100);
if (i0 < 8) {
myself.GiveItem1(target, 9744, 1);
myself.SetFlagJournal(target, 236, 9);
myself.ShowQuestMark(target, 236);
myself.SoundEffect(target, "ItemSound.quest_middle");

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(632);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 428 && 428 != 0) {
if (gg.OwnItemCount(target, 7542) >= 199) {
if (gg.OwnItemCount(target, 7542) < 200) {
myself.GiveItem1(target, 7542, 1);
myself.SoundEffect(target, "ItemSound.quest_middle");

}
myself.SetFlagJournal(target, 632, 2);
myself.ShowQuestMark(target, 632);
myself.SetMemoState(target, 632, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 7542, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}

}

}
super;
	}


}