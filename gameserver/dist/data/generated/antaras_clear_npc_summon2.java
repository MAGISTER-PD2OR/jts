package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class antaras_clear_npc_summon2 extends default_npc {
	protected int suicide1_x = 0;
	protected int suicide2_x = 0;
	protected int suicide3_x = 0;
	protected int suicide4_x = 0;
	protected int suicide5_x = 0;
	protected int suicide6_x = 0;
	protected int suicide1_y = 0;
	protected int suicide2_y = 0;
	protected int suicide3_y = 0;
	protected int suicide4_y = 0;
	protected int suicide5_y = 0;
	protected int suicide6_y = 0;
	protected int zerging_spawn_x = 0;
	protected int zerging_spawn_y = 0;
	protected int dice = 0;

	protected void CREATED() {
myself.LookNeighbor(1000);
myself.i_ai0 = 0;
myself.i_ai1 = 0;
myself.AddTimerEx(1001, 1000);
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id) {
if (timer_id == 1001) {
myself.BroadcastScriptEventEx(12007, myself.i_ai1, myself.i_ai0, 100);
myself.Despawn();

}
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam i1, HandlerParam i2, HandlerParam c2) {
if (myself.IsInCategory(3, creature.occupation) != 0) {
myself.i_ai0 = gg.GetIndexFromCreature(creature);
myself.i_ai1 = myself.i_ai1 + 1;

}
	}


}