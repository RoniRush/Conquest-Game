package bottom;

import java.io.Serializable;
import java.util.List;

public class Unit implements Serializable {
    protected final int rank;
    public final String type;
    protected final int cost;
    protected final int maximumMight;
    protected int maximumMightMulti;
    protected final int fatigueFactor;
    protected int fatigueFactorMulti;
    protected int HP;

    public Unit(int rank, String type, int cost, int maximumMight, int fatigueFactor) {
        this.rank = rank;
        this.type = type;
        this.cost = cost;
        this.maximumMight =HP= maximumMightMulti= maximumMight;
        this.fatigueFactor =fatigueFactorMulti= fatigueFactor;
    }

    public Unit(int maximumMightMulti, int fatigueFactorMulti, List<Unit> model,int i)
    {
        this.rank=model.get(i).rank;
        this.type=model.get(i).type;
        this.cost= model.get(i).cost;
        this.maximumMight= model.get(i).maximumMight;
        this.fatigueFactor=model.get(i).fatigueFactor;
        this.fatigueFactorMulti= fatigueFactorMulti;
        this.maximumMightMulti=HP=maximumMightMulti;
    }

    protected Unit(Unit unit)
    {
        this.maximumMightMulti=unit.maximumMightMulti;
        this.maximumMight=unit.maximumMight;
        this.fatigueFactorMulti= unit.fatigueFactorMulti;
        this.fatigueFactor=unit.fatigueFactor;
        this.HP=unit.HP;
        this.cost=unit.cost;
        this.rank= unit.rank;
        this.type= unit.type;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "type=" + type +
                ", cost=" + cost*maximumMight +
                ", maximumHP=" + maximumMight +
                '}';
    }

    public int getRank() {
        return rank;
    }

    public int getMaximumMightMulti() {
        return maximumMightMulti;
    }

    public int getFatigueFactorMulti() {
        return fatigueFactorMulti;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public int getMaximumMight() {
        return maximumMight;
    }

    public int getFatigueFactor() {
        return fatigueFactor;
    }

    public void setMaximumMightMulti(int maximumMightMulti) {
        this.maximumMightMulti = maximumMightMulti;
    }

    public void setFatigueFactorMulti(int fatigueFactorMulti) {
        this.fatigueFactorMulti = fatigueFactorMulti;
    }

    protected int calcHealToFullForm()
    {
        double d= (double)cost/maximumMight;
        return (int)(d *(maximumMightMulti-HP));
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
