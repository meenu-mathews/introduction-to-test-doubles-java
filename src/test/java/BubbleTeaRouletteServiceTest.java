import com.techreturners.bubbleteaordersystem.model.BubbleTea;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaOrderRequest;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaRequest;
import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import org.junit.Test;
import testhelper.RandomStub;
import static org.junit.Assert.assertEquals;

public class BubbleTeaRouletteServiceTest {

    @Test
    public void shouldGenerateARandomBubbleTeaTypeWhenGetRandomBubbleTeaTypeIsCalled() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.JasmineMilkTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.JasmineMilkTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldReturnPeachIceTeaWhenGetRandomBubbleTeaTypeIsCalled(){

        //Arrange
        RandomStub rs = new RandomStub(BubbleTeaTypeEnum.PeachIceTea.ordinal());
        BubbleTeaRouletteService bs = new BubbleTeaRouletteService(rs);

        //Act & Assert
        assertEquals(BubbleTeaTypeEnum.PeachIceTea,bs.getRandomBubbleTeaType());

    }


    }
