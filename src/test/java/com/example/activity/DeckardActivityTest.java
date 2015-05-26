package com.example.activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;

@RunWith(RobolectricTestRunner.class)
public class DeckardActivityTest {

    @Test
    public void testCardIoError1() {
        CreditCard creditCard = new CreditCard();
    }

    @Test
    public void testCardIoError2() {
        CardIOActivity.canReadCardWithCamera();
    }

}
