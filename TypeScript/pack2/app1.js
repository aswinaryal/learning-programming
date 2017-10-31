"use strict";
exports.__esModule = true;
var AddCommand_1 = require("./commands/AddCommand");
var MathContext_1 = require("./commands/MathContext");
var ctx = new MathContext_1.MathContext(new AddCommand_1.AddCommand());
ctx.doCalculation(50, 150);
