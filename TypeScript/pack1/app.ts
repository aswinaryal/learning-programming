import {Student} from './models/Student';
import {IStudent} from './models/IStudent';
import {ScholarshipStudent} from './models/ScholarshipStudent';

let std:IStudent = new ScholarshipStudent();

std.firstName = "cristiano";
std.lastName = "ronaldo";

console.log(std.fullName());