package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class trader_leon extends merchant {
protected Object[][] SellList0 = {
{"long_sword";20;0.000000;0}, {"throw_knife";20;0.000000;0}, {"bow_of_forest";20;0.000000;0}, {"short_spear";20;0.000000;0}, {"falchion";20;0.000000;0}, {"sword_breaker";20;0.000000;0}, {"composition_bow";20;0.000000;0}, {"buzdygan";20;0.000000;0}, {"morning_star";20;0.000000;0}, {"iron_hammer";20;0.000000;0}, {"long_spear";20;0.000000;0}, {"saber";20;0.000000;0}, {"iron_sword";20;0.000000;0}, {"handiwork_dagger";20;0.000000;0}, {"assassin_knife";20;0.000000;0}, {"strengthening_bow";20;0.000000;0}, {"hand_axe";20;0.000000;0}, {"heavy_mace";20;0.000000;0}, {"work_hammer";20;0.000000;0}, {"trident";20;0.000000;0}, {"bastard_sword";20;0.000000;0}, {"artisan's_sword";20;0.000000;0}, {"poniard_dagger";20;0.000000;0}, {"long_bow";20;0.000000;0}, {"elven_bow";20;0.000000;0}, {"dark_elven_bow";20;0.000000;0}, {"tomahawk";20;0.000000;0}, {"pike";20;0.000000;0}, {"dwarven_trident";20;0.000000;0}, {"two-handed_sword";20;0.000000;0}, {"crimson_sword";20;0.000000;0}, {"elven_sword";20;0.000000;0}, {"kukuri";20;0.000000;0}, {"gastraphetes";20;0.000000;0}, {"spike_club";20;0.000000;0}, {"war_hammer";20;0.000000;0}, {"dwarven_pike";20;0.000000;0}, {"sword_of_revolution";20;0.000000;0}, {"maingauche";20;0.000000;0}, {"cursed_maingauche";20;0.000000;0}, {"strengthening_long_bow";20;0.000000;0}, {"tarbar";20;0.000000;0}, {"giants_sword";20;0.000000;0}, {"giants_hammer";20;0.000000;0}, {"heavy_bone_club";20;0.000000;0}, {"hammer_in_flames";20;0.000000;0}, {"morning_star";20;0.000000;0}, {"winged_spear";20;0.000000;0}, {"cestus";20;0.000000;0}, {"viper's_canine";20;0.000000;0}, {"bagh-nakh";20;0.000000;0}, {"single-edged_jamadhr";20;0.000000;0}, {"triple-edged_jamadhr";20;0.000000;0}, {"bich'hwa";20;0.000000;0}, {"zweihander";20;0.000000;0}, {"heavy_sword";20;0.000000;0}, {"claymore";20;0.000000;0}, {"bonebreaker";20;0.000000;0}, {"mithril_dagger";20;0.000000;0}, {"scallop_jamadhr";20;0.000000;0}, {"cyclone_bow";20;0.000000;0}, {"glaive";20;0.000000;0}, {"elven_long_sword";20;0.000000;0}
};
protected Object[][] SellList1 = {
{"apprentice's_staff";20;0.000000;0}, {"relic_of_saints";20;0.000000;0}, {"mage_staff";20;0.000000;0}, {"crucifix_of_blessing";20;0.000000;0}, {"voodoo_doll";20;0.000000;0}, {"bone_staff";20;0.000000;0}, {"scroll_of_wisdom";20;0.000000;0}, {"sword_of_priest";20;0.000000;0}, {"branch_of_life";20;0.000000;0}, {"proof_of_revenge";20;0.000000;0}, {"mace_of_prayer";20;0.000000;0}, {"doom_hammer";20;0.000000;0}, {"mystic_staff";20;0.000000;0}, {"staff_of_mana";20;0.000000;0}, {"divine_tome";20;0.000000;0}, {"sword_of_magic";20;0.000000;0}, {"sword_of_mystic";20;0.000000;0}, {"sword_of_occult";20;0.000000;0}, {"dagger_of_mana";20;0.000000;0}, {"mystic_knife";20;0.000000;0}, {"conjure_knife";20;0.000000;0}, {"knife_o'_silenus";20;0.000000;0}, {"staff_of_magicpower";20;0.000000;0}, {"blood_of_saints";20;0.000000;0}, {"tome_of_blood";20;0.000000;0}, {"goathead_staff";20;0.000000;0}, {"sword_of_magic_fog";20;0.000000;0}, {"mace_of_priest";20;0.000000;0}, {"crucifix_of_blood";20;0.000000;0}, {"demon_fangs";20;0.000000;0}, {"atuba_hammer";20;0.000000;0}, {"ghost_staff";20;0.000000;0}, {"life_stick";20;0.000000;0}, {"atuba_mace";20;0.000000;0}
};
protected Object[][] SellList4 = {
{"saber_low";20;0.000000;0}, {"iron_sword_low";20;0.000000;0}, {"handiwork_dagger_low";20;0.000000;0}, {"assassin_knife_low";20;0.000000;0}, {"strengthening_bow_low";20;0.000000;0}, {"hand_axe_low";20;0.000000;0}, {"heavy_mace_low";20;0.000000;0}, {"work_hammer_low";20;0.000000;0}, {"trident_low";20;0.000000;0}, {"bastard_sword_low";20;0.000000;0}, {"artisan's_sword_low";20;0.000000;0}, {"poniard_dagger_low";20;0.000000;0}, {"long_bow_low";20;0.000000;0}, {"elven_bow_low";20;0.000000;0}, {"dark_elven_bow_low";20;0.000000;0}, {"tomahawk_low";20;0.000000;0}, {"pike_low";20;0.000000;0}, {"dwarven_trident_low";20;0.000000;0}, {"two-handed_sword_low";20;0.000000;0}, {"crimson_sword_low";20;0.000000;0}, {"elven_sword_low";20;0.000000;0}, {"kukuri_low";20;0.000000;0}, {"gastraphetes_low";20;0.000000;0}, {"spike_club_low";20;0.000000;0}, {"war_hammer_low";20;0.000000;0}, {"dwarven_pike_low";20;0.000000;0}, {"sword_of_revolution_low";20;0.000000;0}, {"maingauche_low";20;0.000000;0}, {"cursed_maingauche_low";20;0.000000;0}, {"strengthening_long_bow_low";20;0.000000;0}, {"tarbar_low";20;0.000000;0}, {"giants_sword_low";20;0.000000;0}, {"giants_hammer_low";20;0.000000;0}, {"heavy_bone_club_low";20;0.000000;0}, {"hammer_in_flames_low";20;0.000000;0}, {"morning_star_low";20;0.000000;0}, {"winged_spear_low";20;0.000000;0}, {"bagh-nakh_low";20;0.000000;0}, {"single-edged_jamadhr_low";20;0.000000;0}, {"triple-edged_jamadhr_low";20;0.000000;0}, {"bich'hwa_low";20;0.000000;0}, {"heavy_sword_low";20;0.000000;0}, {"claymore_low";20;0.000000;0}, {"bonebreaker_low";20;0.000000;0}, {"mithril_dagger_low";20;0.000000;0}, {"scallop_jamadhr_low";20;0.000000;0}, {"cyclone_bow_low";20;0.000000;0}, {"glaive_low";20;0.000000;0}, {"elven_long_sword_low";20;0.000000;0}
};
protected Object[][] SellList5 = {
{"bone_staff_low";20;0.000000;0}, {"scroll_of_wisdom_low";20;0.000000;0}, {"sword_of_priest_low";20;0.000000;0}, {"branch_of_life_low";20;0.000000;0}, {"proof_of_revenge_low";20;0.000000;0}, {"mace_of_prayer_low";20;0.000000;0}, {"doom_hammer_low";20;0.000000;0}, {"mystic_staff_low";20;0.000000;0}, {"staff_of_mana_low";20;0.000000;0}, {"divine_tome_low";20;0.000000;0}, {"sword_of_magic_low";20;0.000000;0}, {"sword_of_mystic_low";20;0.000000;0}, {"sword_of_occult_low";20;0.000000;0}, {"dagger_of_mana_low";20;0.000000;0}, {"mystic_knife_low";20;0.000000;0}, {"conjure_knife_low";20;0.000000;0}, {"knife_o'_silenus_low";20;0.000000;0}, {"staff_of_magicpower_low";20;0.000000;0}, {"blood_of_saints_low";20;0.000000;0}, {"tome_of_blood_low";20;0.000000;0}, {"goathead_staff_low";20;0.000000;0}, {"sword_of_magic_fog_low";20;0.000000;0}, {"mace_of_priest_low";20;0.000000;0}, {"crucifix_of_blood_low";20;0.000000;0}, {"demon_fangs_low";20;0.000000;0}, {"atuba_hammer_low";20;0.000000;0}, {"ghost_staff_low";20;0.000000;0}, {"life_stick_low";20;0.000000;0}, {"atuba_mace_low";20;0.000000;0}
};

	protected void TALK_SELECTED(HandlerParam fhtml0, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 1 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Secret Meeting with Ketra Orcs (In Progress)");

}
if (gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 2 * 10 + 1) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Secret Meeting with Ketra Orcs (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 1 * 10 + 1) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.SetHTMLCookie(talker, 11, 1);
myself.ShowPage(talker, "trader_leon_q0011_0101.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0 && gg.GetMemoState(talker, 11) == 2 * 10 + 1) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "trader_leon_q0011_0202.htm");

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam i0, HandlerParam quest_id, HandlerParam reply, HandlerParam talker) {
if (ask == 11) {
myself.SetCurrentQuestID(11);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 11) {
i0 = myself.GetHTMLCookie(talker, 11, 2 - 1);
if (i0 != -1) {
if (reply == 1 && gg.HaveMemo(talker, 11) == 1 && myself.GetOneTimeQuestFlag(talker, 11) == 0) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.GiveItem1(talker, 7231, 1);
myself.ShowPage(talker, "trader_leon_q0011_0201.htm");
myself.SetMemoState(talker, 11, 2 * 10 + 1);
myself.SetFlagJournal(talker, 11, 2);
myself.ShowQuestMark(talker, 11);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}

}

}
super;
	}


}