USE [db_st]
GO
/****** Object:  Table [dbo].[Table_1]    Script Date: 12/17/2017 20:30:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_1](
	[id] [nchar](10) NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[quarters] [nvarchar](50) NOT NULL,
	[emolument] [nvarchar](max) NOT NULL,
	[sex] [bit] NULL,
 CONSTRAINT [PK_Table_1] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[12.17-zuoye]    Script Date: 12/17/2017 20:30:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[12.17-zuoye](
	[id] [int] NOT NULL,
	[name] [nchar](10) NOT NULL,
	[gender] [tinyint] NOT NULL,
	[year] [money] NOT NULL,
	[worktime] [datetime] NOT NULL,
	[branch] [nchar](10) NOT NULL
) ON [PRIMARY]
GO
