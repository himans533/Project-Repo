import org.junit.jupiter.api.Test;

import Rightclick.RewardValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RewardValueTests {

    @Test
    public void testRewardValueInitialization() {
        RewardValue reward = new RewardValue(100);
        assertEquals(100, reward.getValue());
    }

    @Test
    public void testRewardValueStringRepresentation() {
        RewardValue reward = new RewardValue(100);
        assertEquals("Reward value: 100", reward.toString());
    }

    @Test
    public void testRewardValueAddition() {
        RewardValue reward1 = new RewardValue(100);
        RewardValue reward2 = new RewardValue(50);
        RewardValue result = reward1.add(reward2);
        assertEquals(150, result.getValue());
    }

    @Test
    public void testRewardValueMultiplication() {
        RewardValue reward = new RewardValue(100);
        RewardValue result = reward.multiply(2);
        assertEquals(200, result.getValue());
    }
}

