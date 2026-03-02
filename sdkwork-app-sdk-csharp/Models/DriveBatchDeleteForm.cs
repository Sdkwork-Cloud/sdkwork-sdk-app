using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DriveBatchDeleteForm
    {
        public List<string>? ItemIds { get; set; }
    }
}
