package main.model.problemes;

import main.model.generic.InterfaceRandom;
import main.model.generic.Probleme;
import main.model.generic.Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Scenario extends Solution {

    public Scenario(GraphProject gp) {
        super(gp);
        valuesObjectives = new ArrayList<>(gp.getNbObjectives());
        valuesObjectives.add(0.0);
        valuesObjectives.add(0.0);

        valueVariables = new int[gp.getNbTasks() + gp.getNbOr()];
        // we fill scenario with 0 initially
        Arrays.fill(valueVariables, 0);
    }

    protected void setDuration(double iVal) {
        valuesObjectives.set(0, iVal);
    }

    protected void setCost(double iVal) {
        valuesObjectives.set(1, iVal);
    }

    public void evaluate(Probleme gpTest) {

        int tableauEntier[] = {0, 0, 0, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier)) {
            setDuration(3.8);
            setCost(17.4);
        }
        int tableauEntier1[] = {1, 0, 0, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier1)) {
            setDuration(9.1);
            setCost(23.9);
        }

        int tableauEntier2[] = {0, 1, 0, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier2)) {
            setDuration(9.8);
            setCost(18.5);
        }
        int tableauEntier3[] = {1, 1, 0, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier3)) {
            setDuration(9.1);
            setCost(23.9);
        }
        int tableauEntier4[] = {0, 0, 1, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier4)) {
            setDuration(3.8);
            setCost(17.4);
        }
        int tableauEntier5[] = {1, 0, 1, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier5)) {
            setDuration(4.3);
            setCost(21.5);
        }
        int tableauEntier6[] = {0, 1, 1, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier6)) {
            setDuration(9.8);
            setCost(18.5);
        }
        int tableauEntier7[] = {1, 1, 1, 0, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier7)) {
            setDuration(4.3);
            setCost(21.5);
        }
        int tableauEntier8[] = {0, 0, 0, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier8)) {
            setDuration(9.1);
            setCost(16.5);
        }
        int tableauEntier9[] = {1, 0, 0, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier9)) {
            setDuration(14.4);
            setCost(23.0);
        }
        int tableauEntier10[] = {0, 1, 0, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier10)) {
            setDuration(15.1);
            setCost(17.6);
        }
        int tableauEntier11[] = {1, 1, 0, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier11)) {
            setDuration(14.4);
            setCost(23.0);
        }
        int tableauEntier12[] = {0, 0, 1, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier12)) {
            setDuration(9.1);
            setCost(16.5);
        }
        int tableauEntier13[] = {1, 0, 1, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier13)) {
            setDuration(9.6);
            setCost(20.6);
        }
        int tableauEntier14[] = {0, 1, 1, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier14)) {
            setDuration(15.1);
            setCost(17.6);
        }
        int tableauEntier15[] = {1, 1, 1, 1, 0};
        if (Arrays.equals(this.valueVariables, tableauEntier15)) {
            setDuration(9.6);
            setCost(20.6);
        }
        int tableauEntier16[] = {0, 0, 0, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier16)) {
            setDuration(3.8);
            setCost(14.3);
        }
        int tableauEntier17[] = {1, 0, 0, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier17)) {
            setDuration(9.1);
            setCost(20.8);
        }
        int tableauEntier18[] = {0, 1, 0, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier18)) {
            setDuration(9.8);
            setCost(15.4);
        }
        int tableauEntier19[] = {1, 1, 0, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier19)) {
            setDuration(9.1);
            setCost(20.8);
        }
        int tableauEntier20[] = {0, 0, 1, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier20)) {
            setDuration(3.8);
            setCost(14.3);
        }
        int tableauEntier21[] = {1, 0, 1, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier21)) {
            setDuration(4.3);
            setCost(18.4);
        }
        int tableauEntier22[] = {0, 1, 1, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier22)) {
            setDuration(9.8);
            setCost(15.4);
        }
        int tableauEntier23[] = {1, 1, 1, 0, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier23)) {
            setDuration(4.3);
            setCost(18.4);
        }
        int tableauEntier24[] = {0, 0, 0, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier24)) {
            setDuration(9.1);
            setCost(13.4);
        }
        int tableauEntier25[] = {1, 0, 0, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier25)) {
            setDuration(14.4);
            setCost(19.9);
        }
        int tableauEntier26[] = {0, 1, 0, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier26)) {
            setDuration(15.1);
            setCost(14.5);
        }
        int tableauEntier27[] = {1, 1, 0, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier27)) {
            setDuration(14.4);
            setCost(19.9);
        }
        int tableauEntier28[] = {0, 0, 1, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier28)) {
            setDuration(9.1);
            setCost(13.4);
        }
        int tableauEntier29[] = {1, 0, 1, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier29)) {
            setDuration(9.6);
            setCost(17.5);
        }
        int tableauEntier30[] = {0, 1, 1, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier30)) {
            setDuration(15.1);
            setCost(14.5);
        }
        int tableauEntier31[] = {1, 1, 1, 1, 1};
        if (Arrays.equals(this.valueVariables, tableauEntier31)) {
            setDuration(9.6);
            setCost(17.5);
        }
    }


    @Override
    public void randomSetValues(Probleme pb, InterfaceRandom generator) throws Exception {
        // TODO Auto-generated method stub

    }
}
