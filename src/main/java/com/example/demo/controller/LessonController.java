package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("apis/lessons")
public class LessonController {

    @ApiOperation(value = "${LessonController.list.value}", notes = "${LessonController.list.notes}")
    @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class)
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LessonResponse> list() {
        // 取得処理
        return Arrays.asList(
                new LessonResponse(1, "studentName1", "tutorName1"),
                new LessonResponse(2, "studentName2", "tutorName2"),
                new LessonResponse(3, "studentName3", "tutorName3"));
    }

    @ApiOperation(value = "${LessonController.detail.value}", notes = "${LessonController.detail.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class)})
    @GetMapping("{lessonIdentifier}")
    @ResponseStatus(HttpStatus.OK)
    public LessonResponse detail(@PathVariable("lessonIdentifier") LessonIdentifier lessonIdentifier) {
        // 取得処理
        return new LessonResponse(1, "studentName1", "tutorName1");
    }

    @ApiOperation(value = "${LessonController.add.value}", notes = "${LessonController.add.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class)})
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LessonIdentifierResponse add(@RequestBody LessonRequest lessonRequest) {
        // 追加処理
        return new LessonIdentifierResponse(new LessonIdentifier(4));
    }

    @ApiOperation(value = "${LessonController.delete.value}", notes = "${LessonController.delete.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class)})
    @DeleteMapping("{lessonIdentifier}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("lessonIdentifier") LessonIdentifier lessonIdentifier) {
        // 削除処理
    }

    @ApiOperation(value = "${LessonController.edit.value}", notes = "${LessonController.edit.notes}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class)})
    @PutMapping("{lessonIdentifier}")
    @ResponseStatus(HttpStatus.OK)
    public LessonResponse edit(@PathVariable("lessonIdentifier") LessonIdentifier lessonIdentifier,
                               @RequestBody LessonRequest lessonRequest) {
        // 編集処理
        return new LessonResponse(1, "EditStudentName1", "EditTutorName1");
    }
}
