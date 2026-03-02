using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CategoryMoveForm
    {
        public int? TargetParentId { get; set; }
    }
}
