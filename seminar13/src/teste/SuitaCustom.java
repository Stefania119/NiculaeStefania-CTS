package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.GetPromovabilitateCategory;
import categorii.TesteNormaleCategory;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaWithDummy.class, TestPromovabilitateWithFake.class,
		TestPromovabilitateWithStub.class })
@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory(TesteNormaleCategory.class)
public class SuitaCustom {

}
