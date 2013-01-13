/*
 * Copyright 2012 jts
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.jts.data.holder.setting.common;

/**
 * @author : Camelion
 * @date : 23.08.12  11:54
 */
public enum ClassID {
    fighter(0),
    warrior(1),
    gladiator(2),
    warlord(3),
    knight(4),
    paladin(5),
    dark_avenger(6),
    rogue(7),
    treasure_hunter(8),
    hawkeye(9),

    mage(10),
    wizard(11),
    sorceror(12),
    necromancer(13),
    warlock(14),
    cleric(15),
    bishop(16),
    prophet(17),

    elven_fighter(18),
    elven_knight(19),
    temple_knight(20),
    sword_singer(21),
    elven_scout(22),
    plains_walker(23),
    silver_ranger(24),

    elven_mage(25),
    elven_wizard(26),
    spellsinger(27),
    elemental_summoner(28),
    oracle(29),
    elder(30),

    dark_fighter(31),
    palus_knight(32),
    shillien_knight(33),
    bladedancer(34),
    assassin(35),
    abyss_walker(36),
    phantom_ranger(37),

    dark_mage(38),
    dark_wizard(39),
    spellhowler(40),
    phantom_summoner(41),
    shillien_oracle(42),
    shillien_elder(43),

    orc_fighter(44),
    orc_raider(45),
    destroyer(46),
    orc_monk(47),
    tyrant(48),

    orc_mage(49),
    orc_shaman(50),
    overlord(51),
    warcryer(52),

    dwarven_fighter(53),
    scavenger(54),
    bounty_hunter(55),
    artisan(56),
    warsmith(57),

    duelist(88),
    dreadnought(89),
    phoenix_knight(90),
    hell_knight(91),
    sagittarius(92),
    adventurer(93),
    archmage(94),
    soultaker(95),
    arcana_lord(96),
    cardinal(97),
    hierophant(98),

    eva_templar(99),
    sword_muse(100),
    wind_rider(101),
    moonlight_sentinel(102),
    mystic_muse(103),
    elemental_master(104),
    eva_saint(105),

    shillien_templar(106),
    spectral_dancer(107),
    ghost_hunter(108),
    ghost_sentinel(109),
    storm_screamer(110),
    spectral_master(111),
    shillien_saint(112),

    titan(113),
    grand_khauatari(114),
    dominator(115),
    doomcryer(116),

    fortune_seeker(117),
    maestro(118),

    kamael_m_soldier(123),
    kamael_f_soldier(124),
    trooper(125),
    warder(126),
    berserker(127),
    m_soul_breaker(128),
    f_soul_breaker(129),
    arbalester(130),
    doombringer(131),
    m_soul_hound(132),
    f_soul_hound(133),
    trickster(134),
    inspector(135),
    judicator(136);

    private final int classId;

    ClassID(int classId) {
        this.classId = classId;
    }

    public int getClassId() {
        return classId;
    }
}
