package filrouge.admin.controller;

import org.springframework.http.HttpStatus;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
//public class MyControllerAdvice {
//
//	// @ExceptionHandler
//	// @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	// public String handleException(Exception exception,Model model) {
//	//
//	// model.addAttribute("exception",exception);
//	//
//	// return "exception-page";
//	// }
//
//	@ExceptionHandler
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	public ModelAndView myError(Exception exception) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("exception", exception);
//		mav.setViewName("exception-page");
//		return mav;
//	}
//}
@ControllerAdvice
public class MyControllerAdvice {

  @ExceptionHandler
  //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
 public ModelAndView myError(Exception exception) {
  ModelAndView mav = new ModelAndView();
  mav.addObject("exception", exception);
  mav.setViewName("exception-page");
  return mav;
}

}