"use strict";
exports.__esModule = true;
var AddCommand_1 = require("./commands/AddCommand");
var SubCommand_1 = require("./commands/SubCommand");
var cmd = new AddCommand_1.AddCommand();
console.log(cmd.calculate(15, 15));
var cmd1 = new SubCommand_1.SubCommand();
console.log(cmd1.calculate(20, 5));
